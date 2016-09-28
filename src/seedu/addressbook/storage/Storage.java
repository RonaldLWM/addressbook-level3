package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;

public abstract class Storage {
    
    public abstract String getPath();
    public abstract void save(AddressBook addressBook) throws StorageOperationException;
    public abstract AddressBook load() throws StorageOperationException;
    
    public static class StorageOperationException extends Exception {
        public StorageOperationException(String message) {
            super(message);
        }
    }
}
