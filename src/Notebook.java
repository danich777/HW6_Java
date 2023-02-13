public class Notebook {
    String model;
    String ram;
    String ssd;
    String os;
    String color;

    public Notebook(String ram, String ssd, String os, String color) {
        this.ram = ram;
        this.ssd = ssd;
        this.os = os;
        this.color = color;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getRam() {
        return ram;
    }
    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getSsd() {
        return ssd;
    }
    public void setSdd(String ssd) {
        this.ssd = ssd;
    }

    public String getOs() {
        return os;
    }
    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return model + " " + ram + " " + ssd + " " + os + " " + color;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        else {
            if (obj == null || this.getClass() != obj.getClass()) {
                return false;
            }
            else {
                return false;
            }
        }
    }

}
