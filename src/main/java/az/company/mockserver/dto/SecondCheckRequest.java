package az.company.mockserver.dto;

import lombok.Setter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Setter
@XmlRootElement(name = "mBilling")
public class SecondCheckRequest {

    private String trType;

    private String firstRRN;

    private String lastRRN;

    @XmlElement(name = "TrType")
    public String getTrType() {
        return trType;
    }

    @XmlElement(name = "FirstRRN")
    public String getFirstRRN() {
        return firstRRN;
    }

    @XmlElement(name = "LastRRN")
    public String getLastRRN() {
        return lastRRN;
    }

    @Override
    public String toString() {
        return "SecondCheckRequest{" +
                "trType='" + trType + '\'' +
                ", firstRRN='" + firstRRN + '\'' +
                ", lastRRN='" + lastRRN + '\'' +
                '}';
    }
}
