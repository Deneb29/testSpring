package modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "dim_location")
public class Location {
    @Id
    private String postalCode;
    private String territoryName;
    private String regionName;

    public String getPostalCode() {
        return postalCode;
    }

    public String getRegionName() {
        return regionName;
    }

    public String getTerritoryName() {
        return territoryName;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public void setTerritoryName(String territoryName) {
        this.territoryName = territoryName;
    }

    @Override
    public String toString() {
        return "Location [postalCode=" + postalCode + ", territoryName=" + territoryName + ", regionName=" + regionName
                + "]";
    }

    public Location(String postalCode, String territoryName, String regionName) {
        this.postalCode = postalCode;
        this.territoryName = territoryName;
        this.regionName = regionName;
    }

    public Location() {
    }

}
