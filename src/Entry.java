public class Entry {
    private String title;
    private String content;
    private EntryType type;

    public Entry(String title, String content, EntryType type) {
        if (title ==null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be Empty");

        }
        if (type==null){
           throw new IllegalArgumentException("Type is required!!");
        } 
        this.title = title.trim();
        this.content = (content == null) ? "" : content;
        this.type=type;
        
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public EntryType getType() {
        return type;
    }
}