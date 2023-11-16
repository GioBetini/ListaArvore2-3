import arvoreChar.ArvoreChar;

public class Ex03 {
    public static void main(String[] args) throws Exception {
        char[] vet = {'k', 'm', 'd', 'f', 'b', 'c', 'l', 't', 'p', 'z', 'r'};
        ArvoreChar arvore = new ArvoreChar();
        for (char i : vet){
            arvore.insert(i);
        }
            try{
                System.out.println("Atravessamento pré-ordem:");
                arvore.prefixSearch();
                System.out.println("===========================================");
                System.out.println("Atravessamento em ordem:");
                arvore.infixSearch();
                System.out.println("===========================================");
                System.out.println("Atravessamento pós-ordem:");
                arvore.postfixSearch();
                System.out.println("===========================================");
                arvore.remove('m');
                arvore.search('r');
            } catch (Exception e){
                System.err.println(e.getMessage());
            }
        

    }
}
