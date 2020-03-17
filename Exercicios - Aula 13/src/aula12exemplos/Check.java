/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12exemplos;

import java.util.Objects;

/**
 *
 * @author coelho
 */
public class Check extends Payment {
    
    private String name, bankID;
    private boolean authorized;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBankID() {
        return bankID;
    }

    public void setBankID(String bankID) {
        this.bankID = bankID;
    }

    public boolean isAuthorized() {
        return authorized;
    }

    public void setAuthorized(boolean authorized) {
        this.authorized = authorized;
    }

    public Check(String name, String bankID, boolean authorized, float amount) {
        super(amount);
        this.name = name;
        this.bankID = bankID;
        this.authorized = authorized;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + Objects.hashCode(this.bankID);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Check other = (Check) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.bankID, other.bankID);
    }

    @Override
    public String toString() {
        return super.toString() + " name=" + name + ", bankID=" + bankID + ", authorized=" + authorized;
    }
    
    
}
