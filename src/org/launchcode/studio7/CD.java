package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc{
    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    public CD(String name, int storageCapacity, int remainingCapacity, int capacityUsed) {
        super(name, storageCapacity, remainingCapacity, capacityUsed);
    }

    // TODO: Implement your custom interface.

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
    }

    @Override
    public void readData() {
        System.out.println("The CD is Playing");
    }





}
