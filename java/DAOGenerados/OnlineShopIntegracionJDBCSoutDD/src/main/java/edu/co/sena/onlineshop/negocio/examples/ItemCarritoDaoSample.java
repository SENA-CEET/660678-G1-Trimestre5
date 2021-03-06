/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.onlineshop.negocio.examples;

import java.math.*;
import java.util.Date;
import java.util.Collection;
import edu.co.sena.onlineshop.integracion.dao.ItemCarritoDao;
import edu.co.sena.onlineshop.integracion.dto.ItemCarrito;
import edu.co.sena.onlineshop.integracion.exceptions.ItemCarritoDaoException;
import edu.co.sena.onlineshop.integracion.factory.ItemCarritoDaoFactory;

public class ItemCarritoDaoSample
{
	/**
	 * Method 'main'
	 * 
	 * @param arg
	 * @throws Exception
	 */
	public static void main(String[] arg) throws Exception
	{
		// Uncomment one of the lines below to test the generated code
		
		// findAll();
		// findByProducto("");
		// findByCarritoCompras("");
		// findWhereCarritoComprasIdCarritoEquals("");
		// findWhereProductoIdProductoEquals("");
		// findWhereCantidadEquals(0);
		// findWhereValorUnitarioEquals(0);
		// findWhereValorTotalEquals(0);
	}

	/**
	 * Method 'findAll'
	 * 
	 */
	public static void findAll()
	{
		try {
			ItemCarritoDao _dao = getItemCarritoDao();
			ItemCarrito _result[] = _dao.findAll();
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findByProducto'
	 * 
	 * @param productoIdProducto
	 */
	public static void findByProducto(String productoIdProducto)
	{
		try {
			ItemCarritoDao _dao = getItemCarritoDao();
			ItemCarrito _result[] = _dao.findByProducto(productoIdProducto);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findByCarritoCompras'
	 * 
	 * @param carritoComprasIdCarrito
	 */
	public static void findByCarritoCompras(String carritoComprasIdCarrito)
	{
		try {
			ItemCarritoDao _dao = getItemCarritoDao();
			ItemCarrito _result[] = _dao.findByCarritoCompras(carritoComprasIdCarrito);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereCarritoComprasIdCarritoEquals'
	 * 
	 * @param carritoComprasIdCarrito
	 */
	public static void findWhereCarritoComprasIdCarritoEquals(String carritoComprasIdCarrito)
	{
		try {
			ItemCarritoDao _dao = getItemCarritoDao();
			ItemCarrito _result[] = _dao.findWhereCarritoComprasIdCarritoEquals(carritoComprasIdCarrito);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereProductoIdProductoEquals'
	 * 
	 * @param productoIdProducto
	 */
	public static void findWhereProductoIdProductoEquals(String productoIdProducto)
	{
		try {
			ItemCarritoDao _dao = getItemCarritoDao();
			ItemCarrito _result[] = _dao.findWhereProductoIdProductoEquals(productoIdProducto);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereCantidadEquals'
	 * 
	 * @param cantidad
	 */
	public static void findWhereCantidadEquals(int cantidad)
	{
		try {
			ItemCarritoDao _dao = getItemCarritoDao();
			ItemCarrito _result[] = _dao.findWhereCantidadEquals(cantidad);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereValorUnitarioEquals'
	 * 
	 * @param valorUnitario
	 */
	public static void findWhereValorUnitarioEquals(double valorUnitario)
	{
		try {
			ItemCarritoDao _dao = getItemCarritoDao();
			ItemCarrito _result[] = _dao.findWhereValorUnitarioEquals(valorUnitario);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereValorTotalEquals'
	 * 
	 * @param valorTotal
	 */
	public static void findWhereValorTotalEquals(double valorTotal)
	{
		try {
			ItemCarritoDao _dao = getItemCarritoDao();
			ItemCarrito _result[] = _dao.findWhereValorTotalEquals(valorTotal);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'getItemCarritoDao'
	 * 
	 * @return ItemCarritoDao
	 */
	public static ItemCarritoDao getItemCarritoDao()
	{
		return ItemCarritoDaoFactory.create();
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(ItemCarrito dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getCarritoComprasIdCarrito() );
		buf.append( ", " );
		buf.append( dto.getProductoIdProducto() );
		buf.append( ", " );
		buf.append( dto.getCantidad() );
		buf.append( ", " );
		buf.append( dto.getValorUnitario() );
		buf.append( ", " );
		buf.append( dto.getValorTotal() );
		System.out.println( buf.toString() );
	}

}
