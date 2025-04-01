

import ee.ut.math.tvt.salessystem.logic.ShoppingCart;
import org.junit.Test;
import static org.junit.Assert.*;
import ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO;
import ee.ut.math.tvt.salessystem.dao.SalesSystemDAO;
import ee.ut.math.tvt.salessystem.dataobjects.SoldItem;
import java.util.List;

public class GTv1 {

	@Test(timeout = 4000)
	public void testCreatesShoppingCartAndCallsCancelCurrentPurchase() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    ShoppingCart shoppingCart0 = new ShoppingCart(inMemorySalesSystemDAO0);
	    shoppingCart0.cancelCurrentPurchase();
	}

	@Test(timeout = 4000)
	public void testCreatesShoppingCartAndCallsSubmitCurrentPurchase() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    ShoppingCart shoppingCart0 = new ShoppingCart(inMemorySalesSystemDAO0);
	    shoppingCart0.submitCurrentPurchase();
	}

	@Test(timeout = 4000)
	public void testGetAll() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    ShoppingCart shoppingCart0 = new ShoppingCart(inMemorySalesSystemDAO0);
	    SoldItem soldItem0 = new SoldItem();
	    shoppingCart0.addItem(soldItem0);
	    List<SoldItem> list0 = shoppingCart0.getAll();
	    assertEquals(1, list0.size());
	}

	@Test(timeout = 4000)
	public void testAddItemWithNull() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    ShoppingCart shoppingCart0 = new ShoppingCart(inMemorySalesSystemDAO0);
	    shoppingCart0.addItem((SoldItem) null);
	    shoppingCart0.submitCurrentPurchase();
	}

	@Test(timeout = 4000)
	public void testGetAllReturningListWhereIsEmptyIsFalseAndListWhereSizeIsPositive() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    ShoppingCart shoppingCart0 = new ShoppingCart(inMemorySalesSystemDAO0);
	    SoldItem soldItem0 = new SoldItem();
	    shoppingCart0.addItem(soldItem0);
	    List<SoldItem> list0 = shoppingCart0.getAll();
	    assertEquals(1, list0.size());
	}

	@Test(timeout = 4000)
	public void testSubmitCurrentPurchase() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    ShoppingCart shoppingCart0 = new ShoppingCart(inMemorySalesSystemDAO0);
	    shoppingCart0.addItem((SoldItem) null);
	    shoppingCart0.submitCurrentPurchase();
	}

	@Test(timeout = 4000)
	public void testCancelCurrentPurchase() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    ShoppingCart shoppingCart0 = new ShoppingCart(inMemorySalesSystemDAO0);
	    shoppingCart0.cancelCurrentPurchase();
	}

	@Test(timeout = 4000)
	public void testCreatesShoppingCart() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    ShoppingCart shoppingCart0 = new ShoppingCart(inMemorySalesSystemDAO0);
	    shoppingCart0.submitCurrentPurchase();
	}

	@Test(timeout = 4000)
	public void testSubmitCurrentPurchaseThrowsNullPointerException() throws Throwable {
	    ShoppingCart shoppingCart0 = new ShoppingCart((SalesSystemDAO) null);
	    // Undeclared exception!
	    shoppingCart0.submitCurrentPurchase();
	}

	@Test(timeout = 4000)
	public void testCreatesShoppingCartAndCallsGetAll() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    ShoppingCart shoppingCart0 = new ShoppingCart(inMemorySalesSystemDAO0);
	    List<SoldItem> list0 = shoppingCart0.getAll();
	    assertTrue(list0.isEmpty());
	}

	@Test(timeout = 4000)
	public void testGetAllReturningListWhereIsEmptyIsTrueAndListWhereSizeIsZero() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    ShoppingCart shoppingCart0 = new ShoppingCart(inMemorySalesSystemDAO0);
	    List<SoldItem> list0 = shoppingCart0.getAll();
	    assertTrue(list0.isEmpty());
	}

}