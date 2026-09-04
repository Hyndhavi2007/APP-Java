package Tutorial_6;
interface Confidential {
}
class PublicDocument {
    String name;

    PublicDocument(String name) {
        this.name = name;
    }
}
class ConfidentialDocument implements Confidential {
    String name;

    ConfidentialDocument(String name) {
        this.name = name;
    }
}
class SecretDocument implements Confidential {
    String name;

    SecretDocument(String name) {
        this.name = name;
    }
}
public class DocumentManaging {
    public static void main(String[] args) {
        Object[] documents = {
            new PublicDocument("College Notice"),
            new ConfidentialDocument("Employee Salary"),
            new SecretDocument("Company Passwords")
        };
        for (Object document : documents) {
            if (document instanceof Confidential) {
                System.out.println("Confidential Document");
            } else {
                System.out.println("Public Document");
            }
        }
    }
}
