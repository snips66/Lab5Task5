package ee.ut.math.tvt.salessystem.logic;

import ee.ut.math.tvt.salessystem.dao.SalesSystemDAO;
import ee.ut.math.tvt.salessystem.dataobjects.SoldItem;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private final SalesSystemDAO dao;
    private final List<SoldItem> items = new ArrayList<>();

    public ShoppingCart(SalesSystemDAO dao) {
        this.dao = dao;
    }

    /**
     * Add new SoldItem to table.
     */
    public void addItem(SoldItem item) {
        // TODO In case such stockItem already exists increase the quantity of the existing stock
        //for (SoldItem existingItem: items) {
        //    if (existingItem.getId().equals(item.getId())) {
        //        existingItem.setQuantity(existingItem.getQuantity() + item.getQuantity());
        //        return;
        //    }
        //}

        items.add(item);
        //log.debug("Added " + item.getName() + " quantity of " + item.getQuantity());
    }

    public List<SoldItem> getAll() {
        return items;
    }

    public void cancelCurrentPurchase() {
        items.clear();
    }

    public void submitCurrentPurchase() {
        // decrease quantities of the warehouse stock

        // note the use of transactions. InMemorySalesSystemDAO ignores transactions
        // but when you start using hibernate in lab5, then it will become relevant.
        // what is a transaction? https://stackoverflow.com/q/974596
        dao.beginTransaction();
        try {
            for (SoldItem item : items) {
                dao.saveSoldItem(item);
            }
            dao.commitTransaction();
            items.clear();
        } catch (Exception e) {
            dao.rollbackTransaction();
            throw e;
        }
    }
}
