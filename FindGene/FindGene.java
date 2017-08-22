public class FindGene
{
    public String findGeneSimple(String dna){
        String result = "";
        int startIndex = dna.indexOf("ATG");
        int stopIndex = dna.indexOf("TAA", startIndex + 3);
        result = dna.substring(startIndex, stopIndex + 3);
        return result;
    }
    
    void testGene(){
        String dna = "ACTGCTAATATGCTATAA";
        String gene = findGeneSimple(dna);
        System.out.println("DNA Strand: "+dna+"\nGene: "+gene);
    }
   
}
