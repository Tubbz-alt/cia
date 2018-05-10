/*
 * Copyright 2010 James Pether Sörling
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *	$Id$
 *  $HeadURL$
*/
package com.hack23.cia.model.internal.application.secure.impl;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnTransformer;
import org.javers.core.metamodel.annotation.DiffIgnore;

import com.hack23.cia.model.common.api.ModelObject;

/**
 * The Class EncryptedValue.
 */
@Entity(name = "EncryptedValue")
public class EncryptedValue implements ModelObject {
 
    /** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The id. */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
 
    /** The user id. */
    @Basic
    @Column(name = "USER_ID", length = 255)
    private String userId;

    /** The vault name. */
    @Basic
    @Column(name = "VAULT_NAME", length = 255)
    private String vaultName;
    
    /** The storage. */
    @ColumnTransformer(
        read =  "pgp_sym_decrypt(" +
                "    storage, " +
                "    current_setting('cia.encrypt.key')" +
                ")",
        write = "pgp_sym_encrypt( " +
                "    ?, " +
                "    current_setting('cia.encrypt.key')" +
                ") "
    )
    @Column(columnDefinition = "bytea")
    @DiffIgnore
    private String storage;
    
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *            the new id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Gets the storage.
	 *
	 * @return the storage
	 */
	public String getStorage() {
		return storage;
	}

	/**
	 * Sets the storage.
	 *
	 * @param storage
	 *            the new storage
	 */
	public void setStorage(String storage) {
		this.storage = storage;
	}

	/**
	 * Gets the user id.
	 *
	 * @return the user id
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * Sets the user id.
	 *
	 * @param userId
	 *            the new user id
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * Gets the vault name.
	 *
	 * @return the vault name
	 */
	public String getVaultName() {
		return vaultName;
	}

	/**
	 * Sets the vault name.
	 *
	 * @param vaultName
	 *            the new vault name
	 */
	public void setVaultName(String vaultName) {
		this.vaultName = vaultName;
	}    
	
}