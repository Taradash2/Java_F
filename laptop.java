package HW.Java_F;

public class laptop {
    private String color;
    private Integer RAM;
    private String OS;
    private Integer HDD;
    private Integer Id;
    private String brand;
    private String model;
    private boolean isBooked = false;

    public laptop (String model, Integer Id, String brand){
        this.model = model;
        this.Id = Id;
        this.brand = brand;
        System.out.println("Ноутбук марки "+"'"+ this.brand+"'"+" Модель "+this.model+" С id " +Integer.toString(this.Id));
    }
    public String getColor(){
        return this.color;
    }
    public Integer getRAM(){
        return this.RAM;
    }
    public String getOS(){
        return this.OS;
    }
    public Integer getHDD(){
        return this.HDD;
    }
    public Integer getID(){
        return this.Id;
    }
    public String getBrend(){
        return this.brand;
    }
    public String getModel(){
        return this.model;
    }
    public boolean getBoooking(){
        return this.isBooked;
    }
    public void setColor (String color){
        this.color = color;
    }
    public void setRAM (Integer RAM){
        this.RAM = RAM;
    }
    public void setOS(String OS){
        this.OS = OS;
    }
    public void setHDD(Integer HDD){
        this.HDD = HDD;
    }
    public void Book(){
        if (isBooked == false){
            this.isBooked=false;
        }
        else System.out.println("this laptop alredy booked");
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Laptops");
        sb.append(this.Id);
        sb.append(System.lineSeparator());
        sb.append(this.color);
        sb.append("");
        sb.append(this.brand);
        sb.append("");
        sb.append(this.model);
        sb.append(System.lineSeparator());
        sb.append("OS" + this.OS);
        sb.append(System.lineSeparator());
        sb.append("HDD" + this.HDD);
        sb.append(System.lineSeparator());
        sb.append("RAM" + this.RAM);
        sb.append(System.lineSeparator());
        if(this.isBooked == false) sb.append("Not Booked");
        else sb.append("Booked");

        return(sb.toString());
    }
    
}
