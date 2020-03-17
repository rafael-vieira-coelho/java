/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12exemplos;

/**
 *
 * @author coelho
 */
public class Cash extends Payment {
    private float cashTendered;

    public Cash(float cashTendered, float amount) {
        super(amount);
        this.cashTendered = cashTendered;
    }

    public float getCashTendered() {
        return cashTendered;
    }

    public void setCashTendered(float cashTendered) {
        this.cashTendered = cashTendered;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Float.floatToIntBits(this.cashTendered);
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
        final Cash other = (Cash) obj;

        return Float.floatToIntBits(this.cashTendered) == Float.floatToIntBits(other.cashTendered);
    }

    @Override
    public String toString() {
        return super.toString() + " cashTendered=" + cashTendered;
    }
    
}
