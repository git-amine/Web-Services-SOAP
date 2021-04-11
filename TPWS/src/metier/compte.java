package metier;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.util.Date;

@XmlRootElement(name = "compte")
@XmlAccessorType(XmlAccessType.FIELD)

public class compte {
    private long code;
    private double solde;
    @XmlTransient
    private Date dateCreation;

    public compte(long code, double solde, Date dareCreation) {
        this.code = code;
        this.solde = solde;
        this.dateCreation = dareCreation;
    }

    public compte() {
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDareCreation() {
        return dateCreation;
    }

    public void setDareCreation(Date dareCreation) {
        this.dateCreation = dareCreation;
    }
}

