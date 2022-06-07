package com.mycompany.sistemagestaoprojeto.collection;

import java.util.ArrayList;
import com.mycompany.sistemagestaoprojeto.model.Bonus;


public class HistoricoBonus {
    
    private ArrayList<BonusHistorico> historico;
    
    public HistoricoBonus() {
        historico = new ArrayList<>();
    }
    
    public void addBonusHistorico(Bonus bonus, String cargo, double salarioBase) {
        BonusHistorico bh = new BonusHistorico(bonus.getNome(), bonus.getValor(), cargo, salarioBase);
        bh.setData(bonus.getData());
        historico.add(bh);
    }
    
    public ArrayList<BonusHistorico> getHistorico() {
        return historico;
    }
    
}
