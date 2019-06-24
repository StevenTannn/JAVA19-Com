class CPU {
    private double clock;
    private int core;
    private String merk;

    public CPU(String merk, double clock, int core) {
        this.merk = merk;
        this.core = core;
        this.clock = clock;
    }

    public String getMerk() {
        return merk;
    }

    public int getCore() {
        return core;
    }

    public double getClock() {
        return clock;
    }

}
