package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {
    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    public DVD(String name, int storageCapacity, int remainingCapacity, int capacityUsed) {
        super(name, storageCapacity, remainingCapacity, capacityUsed);
    }

    // TODO: Implement your custom interface.

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }

    @Override
    public void readData() {
        System.out.println("The DVD is playing");
    }



}
