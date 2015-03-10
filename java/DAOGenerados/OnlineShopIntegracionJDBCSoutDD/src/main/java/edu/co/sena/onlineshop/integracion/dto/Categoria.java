/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.onlineshop.integracion.dto;

import edu.co.sena.onlineshop.integracion.dao.*;
import edu.co.sena.onlineshop.integracion.factory.*;
import edu.co.sena.onlineshop.integracion.exceptions.*;
import java.io.Serializable;
import java.util.*;

public class Categoria implements Serializable
{
	/** 
	 * This attribute maps to the column ID_CATEGORIA in the categoria table.
	 */
	protected int idCategoria;

	/** 
	 * This attribute represents whether the attribute idCategoria has been modified since being read from the database.
	 */
	protected boolean idCategoriaModified = false;

	/** 
	 * This attribute maps to the column NOMBRE in the categoria table.
	 */
	protected String nombre;

	/** 
	 * This attribute represents whether the attribute nombre has been modified since being read from the database.
	 */
	protected boolean nombreModified = false;

	/** 
	 * This attribute maps to the column ACTIVA in the categoria table.
	 */
	protected short activa;

	/** 
	 * This attribute represents whether the primitive attribute activa is null.
	 */
	protected boolean activaNull = true;

	/** 
	 * This attribute represents whether the attribute activa has been modified since being read from the database.
	 */
	protected boolean activaModified = false;

	/** 
	 * This attribute maps to the column Pariente in the categoria table.
	 */
	protected int pariente;

	/** 
	 * This attribute represents whether the primitive attribute pariente is null.
	 */
	protected boolean parienteNull = true;

	/** 
	 * This attribute represents whether the attribute pariente has been modified since being read from the database.
	 */
	protected boolean parienteModified = false;

	/**
	 * Method 'Categoria'
	 * 
	 */
	public Categoria()
	{
	}

	/**
	 * Method 'getIdCategoria'
	 * 
	 * @return int
	 */
	public int getIdCategoria()
	{
		return idCategoria;
	}

	/**
	 * Method 'setIdCategoria'
	 * 
	 * @param idCategoria
	 */
	public void setIdCategoria(int idCategoria)
	{
		this.idCategoria = idCategoria;
		this.idCategoriaModified = true;
	}

	/** 
	 * Sets the value of idCategoriaModified
	 */
	public void setIdCategoriaModified(boolean idCategoriaModified)
	{
		this.idCategoriaModified = idCategoriaModified;
	}

	/** 
	 * Gets the value of idCategoriaModified
	 */
	public boolean isIdCategoriaModified()
	{
		return idCategoriaModified;
	}

	/**
	 * Method 'getNombre'
	 * 
	 * @return String
	 */
	public String getNombre()
	{
		return nombre;
	}

	/**
	 * Method 'setNombre'
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
		this.nombreModified = true;
	}

	/** 
	 * Sets the value of nombreModified
	 */
	public void setNombreModified(boolean nombreModified)
	{
		this.nombreModified = nombreModified;
	}

	/** 
	 * Gets the value of nombreModified
	 */
	public boolean isNombreModified()
	{
		return nombreModified;
	}

	/**
	 * Method 'getActiva'
	 * 
	 * @return short
	 */
	public short getActiva()
	{
		return activa;
	}

	/**
	 * Method 'setActiva'
	 * 
	 * @param activa
	 */
	public void setActiva(short activa)
	{
		this.activa = activa;
		this.activaNull = false;
		this.activaModified = true;
	}

	/**
	 * Method 'setActivaNull'
	 * 
	 * @param value
	 */
	public void setActivaNull(boolean value)
	{
		this.activaNull = value;
		this.activaModified = true;
	}

	/**
	 * Method 'isActivaNull'
	 * 
	 * @return boolean
	 */
	public boolean isActivaNull()
	{
		return activaNull;
	}

	/** 
	 * Sets the value of activaModified
	 */
	public void setActivaModified(boolean activaModified)
	{
		this.activaModified = activaModified;
	}

	/** 
	 * Gets the value of activaModified
	 */
	public boolean isActivaModified()
	{
		return activaModified;
	}

	/**
	 * Method 'getPariente'
	 * 
	 * @return int
	 */
	public int getPariente()
	{
		return pariente;
	}

	/**
	 * Method 'setPariente'
	 * 
	 * @param pariente
	 */
	public void setPariente(int pariente)
	{
		this.pariente = pariente;
		this.parienteNull = false;
		this.parienteModified = true;
	}

	/**
	 * Method 'setParienteNull'
	 * 
	 * @param value
	 */
	public void setParienteNull(boolean value)
	{
		this.parienteNull = value;
		this.parienteModified = true;
	}

	/**
	 * Method 'isParienteNull'
	 * 
	 * @return boolean
	 */
	public boolean isParienteNull()
	{
		return parienteNull;
	}

	/** 
	 * Sets the value of parienteModified
	 */
	public void setParienteModified(boolean parienteModified)
	{
		this.parienteModified = parienteModified;
	}

	/** 
	 * Gets the value of parienteModified
	 */
	public boolean isParienteModified()
	{
		return parienteModified;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof Categoria)) {
			return false;
		}
		
		final Categoria _cast = (Categoria) _other;
		if (idCategoria != _cast.idCategoria) {
			return false;
		}
		
		if (idCategoriaModified != _cast.idCategoriaModified) {
			return false;
		}
		
		if (nombre == null ? _cast.nombre != nombre : !nombre.equals( _cast.nombre )) {
			return false;
		}
		
		if (nombreModified != _cast.nombreModified) {
			return false;
		}
		
		if (activa != _cast.activa) {
			return false;
		}
		
		if (activaNull != _cast.activaNull) {
			return false;
		}
		
		if (activaModified != _cast.activaModified) {
			return false;
		}
		
		if (pariente != _cast.pariente) {
			return false;
		}
		
		if (parienteNull != _cast.parienteNull) {
			return false;
		}
		
		if (parienteModified != _cast.parienteModified) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		_hashCode = 29 * _hashCode + idCategoria;
		_hashCode = 29 * _hashCode + (idCategoriaModified ? 1 : 0);
		if (nombre != null) {
			_hashCode = 29 * _hashCode + nombre.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (nombreModified ? 1 : 0);
		_hashCode = 29 * _hashCode + (int) activa;
		_hashCode = 29 * _hashCode + (activaNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (activaModified ? 1 : 0);
		_hashCode = 29 * _hashCode + pariente;
		_hashCode = 29 * _hashCode + (parienteNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (parienteModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return CategoriaPk
	 */
	public CategoriaPk createPk()
	{
		return new CategoriaPk(idCategoria);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "edu.co.sena.onlineshop.integracion.dto.Categoria: " );
		ret.append( "idCategoria=" + idCategoria );
		ret.append( ", nombre=" + nombre );
		ret.append( ", activa=" + activa );
		ret.append( ", pariente=" + pariente );
		return ret.toString();
	}

}