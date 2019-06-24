import java.util.List;
import java.util.ArrayList;

public class Computer {
    private CPU cpu;
    private List<Memory> memories;
    private List<Storage> storages;
    private PSU psu;

    public Computer() {
        this.memories = new ArrayList<Memory>();
        this.storages = new ArrayList<Storage>();
    }

    public void replaceCPU(CPU cpu) {
        this.cpu = cpu;
    }

    public void replaceMemory(int slot, Memory memory) {
        if (memory != null)
            memories.remove(slot - 1);
        this.memories.add(slot - 1, memory);
    }

    public void addStorage(Storage storage) {
        this.storages.add(storage);
    }

    public void replacePSU(PSU psu) {
        this.psu = psu;
    }

    public String printMemory() {
        int memory_kapasitas = 0;
        String slotting = "";
        for (Memory m : memories) {

            if (m != null) {
                memory_kapasitas += m.getKapasitas();
                slotting = slotting + "Slot " + (memories.indexOf(m) + 1) + ": " + m.getKapasitas() + "GB\n";
            }
        }

        return "Memory: " + memory_kapasitas + "GB\n" + slotting;
    }

    public String printStorage() {
        int storage_kapasitas = 0;
        String storaging = "";
        for (Storage s : storages) {
            storage_kapasitas += s.getKapasitas();
            storaging = storaging + s.getType() + ": " + s.getKapasitas() + "GB\n";

        }
        return "Storage: " + storage_kapasitas + "GB\n" + storaging;
    }

    public String getSpec() {

        String spec;
        spec = "CPU: " + cpu.getMerk() + " " + cpu.getClock() + "Ghz " + cpu.getCore() + " core(s)\n" + "===\n"
                + printMemory() + "===\n" + printStorage() + "===\n" + "PSU: " + psu.getPower() + "watt";
        return spec;

    }

}
