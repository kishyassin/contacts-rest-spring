package com.ltp.contacts.service;

import com.ltp.contacts.pojo.Contact;

public interface ContactService {
    public Contact getContactById(String id);
    public void saveContact(Contact conatct);
    public void updateContact(String id, Contact conatct);
    public void deleteContact(String id);
}
