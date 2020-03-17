package aula12exemplos;

import java.util.Objects;

/**
 *
 * @author coelho
 */
public class WireTransfer extends Payment {
    private String bankID, bankName;

    public String getBankID() {
        return bankID;
    }

    public void setBankID(String bankID) {
        this.bankID = bankID;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public WireTransfer(String bankID, String bankName, float amount) {
        super(amount);
        this.bankID = bankID;
        this.bankName = bankName;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.bankID);
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
        final WireTransfer other = (WireTransfer) obj;

        return Objects.equals(this.bankID, other.bankID);
    }

    @Override
    public String toString() {
        return super.toString() + " bankID=" + bankID + ", bankName=" + bankName;
    }
    
    
}
