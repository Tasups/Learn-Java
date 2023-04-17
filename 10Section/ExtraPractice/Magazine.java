public class Magazine {
    
    private String author;
    private String publisher;
    private int issueNumber;
    private int publicationYear;
    
    public Magazine(String author, String publisher, int issueNumber, int publicationYear) {
        setAuthor(author);
        setPublisher(publisher);
        setIssueNumber(issueNumber);
        setPublicationYear(publicationYear);
    }
    
    public Magazine(Magazine source) {
        this.author = source.author;
        this.publisher = source.publisher;
        this.issueNumber = source.issueNumber;
        this.publicationYear = source.publicationYear;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String author) {
        if (author == null || author.isBlank()) {
            throw new IllegalArgumentException("Author name cannot be null or empty");
        }
        this.author = author;
    }
    
    public String getPublisher() {
        return publisher;
    }
    
    public void setPublisher(String publisher) {
        if (publisher == null || publisher.isBlank()) {
            throw new IllegalArgumentException("Publisher cannot be null or empty");
        }
        this.publisher = publisher;
    }
    
    public int getIssueNumber() {
        return issueNumber;
    }
    
    public void setIssueNumber(int issueNumber) {
        if (issueNumber < 0) {
            throw new IllegalArgumentException("Issue number cannot be less than zero")
        }
        this.issueNumber = issueNumber;
    }
    
    public int getPublicationYear() {
        return publicationYear;
    }
    
    public void setPublicationYear(int publicationYear) {
        if (publicationYear < 0) {
            thrown new IllegalArgumentException("Publication year cannot be less than zero")
        }
        this.publicationYear = publicationYear;
    }
    
}