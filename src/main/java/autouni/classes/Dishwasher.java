package autouni.classes;

import autouni.exceptions.CleanPlatesArentExtractedException;
import autouni.exceptions.MachineIsEmptyException;
import autouni.exceptions.MachineIsOverLoadedException;
import autouni.exceptions.MachineIsWorkingException;

public class Dishwasher {

    private boolean isWorking = false;
    private boolean isWashingCompleted = false;
    private int currentLoad = 0;
    private final int maxLoad;

    public Dishwasher(int maxLoad) {
        this.maxLoad = maxLoad;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public boolean isWashingCompleted() {
        return isWashingCompleted;
    }

    public int getCurrentLoad() {
        return currentLoad;
    }

    public int getMaxLoad() {
        return maxLoad;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }

    public void setCurrentLoad(int currentLoad) {
        this.currentLoad = currentLoad;
    }

    public void setWashingCompleted(boolean washingCompleted) {
        isWashingCompleted = washingCompleted;
    }

    /**
     * @throws MachineIsWorkingException if load the plates when machine is running
     * @throws MachineIsOverLoadedException if current load more than max load
     * @throws CleanPlatesArentExtractedException if machine has completed cleaning
     */
    void loadPlate() {
        if (isWorking) {
            throw new MachineIsWorkingException("Please stop the machine before loading the plates");
        }
        if (currentLoad >= maxLoad) {
            throw new MachineIsOverLoadedException("Machine is overloaded.");
        }
        if (currentLoad != 0 && isWashingCompleted) {
            throw new CleanPlatesArentExtractedException("Please extract all clean plates before loading dirty");
        }
        setCurrentLoad(currentLoad + 1);
        System.out.println("All plates have been loaded");
    }

    void extractAllPlates() {
        if (currentLoad == 0) {
            throw new MachineIsEmptyException("Machine is empty");
        }
        if (isWorking) {
            throw new MachineIsWorkingException("Please stop the machine before extracting the plates");
        }
        setCurrentLoad(0);
        System.out.println("All plates have been extracted");

    }

    void runTheMachine() {
        if (getCurrentLoad() == 0) {
            throw new MachineIsEmptyException("Please load the machine before run it");
        }
        if (isWorking()) {
            throw new MachineIsWorkingException("Machine has been already working");
        }
        if (isWashingCompleted() && getCurrentLoad() != 0) {
            throw new CleanPlatesArentExtractedException("Please extract clean plates before run");
        }
        setWorking(true);
        setWashingCompleted(true);
        System.out.println("Machine has been run");
    }

    void stopMachine() {
        if (!isWorking()) {
            throw new MachineIsWorkingException("Machine is stopped");
        }
        setWorking(false);
        System.out.println("Machine has been stopped");
    }

}
