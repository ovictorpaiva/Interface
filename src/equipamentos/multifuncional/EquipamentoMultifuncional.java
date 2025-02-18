package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressoara.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {
    public void copiar(){
        System.out.println("Copiando via Equipamento Multifuncional");
    }
    public void digitalizar(){
        System.out.println("Digitalizando via Equipamento Multifuncional");
    }
    public void imprimir(){
        System.out.println("Imprimindo via Equipamento Multifuncional");
    }
}
