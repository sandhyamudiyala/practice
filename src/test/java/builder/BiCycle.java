package com.designpattern.builder;

public class BiCycle {
    private String gears;
    private String doubleStands;
    private String doubleSeats;
    private String  carrier;

    private BiCycle(Builder builder){
        this.gears=builder.gears;
        this.doubleSeats=builder.doubleSeats;
        this.doubleStands=builder.doubleStands;
        this.carrier=builder.carrier;

    }
    public static class Builder {
        private String gears;
        private String doubleStands;
        private String doubleSeats;
        private String carrier;

        public Builder() {
        }

        public Builder gears(String gears) {
            ;
            this.gears = gears;
            return this;
        }

        public Builder doubleStands(String doubleStands) {
            this.doubleStands = doubleStands;
            return this;
        }

        public Builder doubleSeats(String doubleSeats) {
            this.doubleSeats = doubleSeats;
            return this;
        }

        public Builder carrier(String carrier) {
            this.carrier = carrier;
            return this;

        }

        public BiCycle build() {
            return new BiCycle(this);

        }

    }

}
