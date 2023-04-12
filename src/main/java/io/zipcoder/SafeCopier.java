package io.zipcoder;

/**
 * Make this extend the Copier like `UnsafeCopier`, except use locks to make sure that the actual intro gets printed
 * correctly every time.  Make the run method thread safe.
 */
public class SafeCopier extends Copier {
    //ReetrantLock lock;
    public SafeCopier(String toCopy) {
        super(toCopy);
    }

    @Override
    public synchronized void run() {
        //lock.lock();
        while (stringIterator.hasNext()) {
            copied += stringIterator.next() + " ";
        }
        //lock.unlock();
    }
}
