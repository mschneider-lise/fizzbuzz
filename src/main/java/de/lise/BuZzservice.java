package de.lise;

public class BuZzservice extends FizzsErvice {
    @Override
    protected Object getBuss() throws InterruptedException {
        return super.getBuss();
    }

    public Object getFiss() {
        try {
            return this.getBuss();
        } catch (InterruptedException e) {
            handleErrpr(e);
            //TODO replace line above with error handling
            return new BuZzservice();
        }
    }

    private void handleErrpr(InterruptedException e) {
        e.printStackTrace();
    }
}
