package org.dselent.course_load_scheduler.client.widgets;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.cellview.client.HasKeyboardSelectionPolicy.KeyboardSelectionPolicy;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.view.client.SingleSelectionModel;
import com.google.gwt.xml.client.Comment;

public class FacultyDataWidget extends Composite {

  /**
   * A simple data type that represents a contact.
   */
  private static class Contact {
    private final String address;
    private final String name;

    public Contact(String name, String address) {
      this.name = name;
      this.address = address;
    }
  }

  /**
   * The list of data to display.
   */
  private static final List<Contact> CONTACTS = Arrays.asList(
      new Contact("John", "123 Fourth Avenue"),
      new Contact("Joe", "22 Lance Ln"),
      new Contact("George", "1600 Pennsylvania Avenue"));

  public void onModuleLoad() {
    // Create a CellTable.
    CellTable<Contact> table = new CellTable<Contact>();
    table.setKeyboardSelectionPolicy(KeyboardSelectionPolicy.ENABLED);

    // Add a text column to show the name.
    TextColumn<Contact> nameColumn = new TextColumn<Contact>() {
      @Override
      public String getValue(Contact object) {
        return object.name;
      }
    };
    table.addColumn(nameColumn, "Name");

    // Add a text column to show the address.
    TextColumn<Contact> addressColumn = new TextColumn<Contact>() {
      @Override
      public String getValue(Contact object) {
        return object.address;
      }
    };
    table.addColumn(addressColumn, "Address");


    // Set the total row count. This isn't strictly necessary, but it affects
    // paging calculations, so its good habit to keep the row count up to date.
    table.setRowCount(CONTACTS.size(), true);

    // Push the data into the widget.
    table.setRowData(0, CONTACTS);

    // Add it to the root panel.
    
    RootPanel.get().add(table);
  }
}
