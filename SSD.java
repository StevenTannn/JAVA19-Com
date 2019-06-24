public class SSD extends Storage {
    public int kapasitas;

    public SSD(int kapasitas) {
        super(kapasitas);
    }

    public String getType() {
        return "SSD";
    }

}
