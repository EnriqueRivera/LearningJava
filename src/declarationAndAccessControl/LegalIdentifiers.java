
package declarationAndAccessControl;

public class LegalIdentifiers {
    /*
    ¡ Identifiers must start with a letter, a currency character ($), or a connecting
        character such as the underscore ( _ ). Identifiers cannot start with a number!
    ¡ After the first character, identifiers can contain any combination of letters,
        currency characters, connecting characters, or numbers.
    ¡ In practice, there is no limit to the number of characters an identifier can
        contain.
    ¡ You can't use a Java keyword as an identifier. Table 1-1 lists all of the Java
        keywords including one new one for 5.0, enum.
    ¡ Identifiers in Java are case-sensitive; foo and FOO are two different identifiers.
    */
    public static void main(String[] args) {
        //Legal identifiers
        int _a;
        int $c;
        int ______2_w;
        int _$;
        int this_is_a_very_detailed_name_for_an_identifier;
        
        //Illegal identifiers
        /*int :b;
        int -d;
        int e#;
        int .f;
        int 7g;*/
    }
}
