package problem2;

import java.util.HashSet;
import java.util.Set;

public class Catalog {
  private Set<AbstractItem> items;

  /**
   * Constructor for Catalog Class
   */
  public Catalog() {
    this.items = new HashSet<>();
  }

  /**
   * Constructor for Catalog Class
   * @param items a collection of all the items in the library
   */
  public Catalog(Set<AbstractItem> items) {
    this.items = items;
  }

  /**
   * Add an item to the collection library
   * @param item a item added to the collection library
   */
  public void addItem(AbstractItem item) {
    this.items.add(item);
  }

  /**
   * Remove an item from the collection library
   * @param item a item removed from the collection library
   */
  public void removeItem(AbstractItem item) {
    this.items.remove(item);
  }

  /**
   * Retrieve all items in the catalog, regardless
   * of type, that have a title containing the keyword
   * @param keyword a keyword used for retrieve
   * @return all items in the catalog have a title containing the keyword
   */
  public Set<AbstractItem> search(String keyword) {
    Set<AbstractItem> targetItems = new HashSet<>();
    for (AbstractItem itemIter : this.items) {
      if (itemIter.getItemTitle().toLowerCase().contains(keyword.toLowerCase())) {
        targetItems.add(itemIter);
      }
    }
    return targetItems;
  }

  /**
   * Retrieve all items in the catalog that have an
   * exact match for the given author
   * @param author an author of book
   * @return all boos of this author.
   */
  public Set<AbstractItem> search(Author author) {
    Set<AbstractItem> targetItems = new HashSet<>();
    for (AbstractItem itemIter : this.items) {
      if (itemIter.getCreator().equals(author)) {
        targetItems.add(itemIter);
      }
    }
    return targetItems;
  }

  /**
   * Retrieve all items in the catalog
   * that have an exact match for the given artist
   * @param artist the sole creator of the Music or one member of a Band.
   * @return all music of this artist.
   */
  public Set<AbstractItem> search(RecordingArtist artist) {
    Set<AbstractItem> targetItems = new HashSet<>();
    for (AbstractItem itemIter : this.items) {
      if (itemIter.getCreator().isBand() && itemIter.getCreator().getArtists().contains(artist)) {
        targetItems.add(itemIter);
      }

      if (!itemIter.getCreator().isBand() && itemIter.getCreator().equals(artist)) {
        targetItems.add(itemIter);
      }
    }
    return targetItems;
  }
  }
