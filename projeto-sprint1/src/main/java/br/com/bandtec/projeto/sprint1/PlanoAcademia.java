/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.projeto.sprint1;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class PlanoAcademia extends javax.swing.JFrame {

    /**
     * Creates new form PlanoAcademia
     */
    public PlanoAcademia() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tatsumaki = new javax.swing.JLabel();
        lbModalidade = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        lbPlano = new javax.swing.JLabel();
        Calcular = new javax.swing.JButton();
        txtModalidade = new javax.swing.JTextField();
        txtPlano = new javax.swing.JTextField();
        lbPlanos = new javax.swing.JLabel();
        lbModalidades = new javax.swing.JLabel();
        lbMusculacao = new javax.swing.JLabel();
        lbNatacao = new javax.swing.JLabel();
        lbPlanoMensal = new javax.swing.JLabel();
        lbMuayThai = new javax.swing.JLabel();
        lbPlanoBimestral = new javax.swing.JLabel();
        lbJiuJitsu = new javax.swing.JLabel();
        lbPlanoTrimestral = new javax.swing.JLabel();
        lbPlanoSemestral = new javax.swing.JLabel();
        lbPlanoAnual = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tatsumaki.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Tatsumaki.setForeground(new java.awt.Color(198, 0, 0));
        Tatsumaki.setText("Plano da Academia Tatsumaki");

        lbModalidade.setText("Escolha uma modalidade:");

        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        txtResultado.setText("Valores de acordo com o plano \nescolhido:\n");
        jScrollPane1.setViewportView(txtResultado);

        lbPlano.setText("Escolha seu plano:");

        Calcular.setText("Calcular");
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });

        lbPlanos.setText("Planos:");

        lbModalidades.setText("Modalidades:");

        lbMusculacao.setText("-Musculação");

        lbNatacao.setText("-Natação");

        lbPlanoMensal.setText("-Plano mensal");

        lbMuayThai.setText("-Muay thai");

        lbPlanoBimestral.setText("-Plano bimestral");

        lbJiuJitsu.setText("-Jiu jitsu");

        lbPlanoTrimestral.setText("-Plano trimestral");

        lbPlanoSemestral.setText("-Plano semestral");

        lbPlanoAnual.setText("-Plano anual");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lbModalidades))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbMusculacao)
                            .addComponent(lbNatacao))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbMuayThai)
                            .addComponent(lbJiuJitsu))))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Tatsumaki)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbPlano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbModalidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Calcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtModalidade)
                            .addComponent(txtPlano))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbPlanos, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbPlanoMensal)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbPlanoTrimestral))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbPlanoBimestral)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbPlanoSemestral))
                                    .addComponent(lbPlanoAnual))))
                        .addGap(53, 53, 53))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tatsumaki)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbPlanos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbPlanoMensal)
                            .addComponent(lbPlanoTrimestral))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbPlanoBimestral)
                            .addComponent(lbPlanoSemestral))
                        .addGap(13, 13, 13)
                        .addComponent(lbPlanoAnual)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbModalidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtModalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(lbPlano)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPlano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbModalidades)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbMusculacao)
                            .addComponent(lbMuayThai))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNatacao)
                            .addComponent(lbJiuJitsu))
                        .addGap(32, 32, 32)))
                .addComponent(Calcular)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
        
        Scanner leitorTextos = new Scanner(System.in);
        Scanner leitorNumeros = new Scanner(System.in);
        
        // Possuir valores brutos, porcentagem e econômia de 1 mês até 1 ano.
        
        String modalidadeTxt = txtModalidade.getText();
        String planoTxt = txtPlano.getText();
        
        // Modalidades;
        String musculacao = "Musculação";
        String natacao = "Natação";
        String jiujitsu = "Jiu jitsu";
        String muaythai = "Muay thai";
        
        // Planos;
        
        String planoMensal = "Plano mensal";
        String planoBimestral = "Plano bimestral";
        String planoTrimestral = "Plano trimestral";
        String planoSemestral = "Plano semestral";
        String planoAnual = "Plano anual";
        
        // Meses dos Planos;
        
        Integer valorMensal = 1;
        Integer valorBimestral = 2;
        Integer valorTrimestral = 3;
        Integer valorSemestral = 6;
        Integer valorAnual = 12;
        
        if(modalidadeTxt.equals(musculacao)){
            Double valorMusculacao = 69.90;
            Double resultado = valorMusculacao * valorMensal;
            Double resultado2 = valorMusculacao * valorBimestral;
            Double resultado3 = valorMusculacao * valorTrimestral;
            Double resultado4 = valorMusculacao * valorSemestral;
            Double resultado5 = valorMusculacao * valorAnual;
            
            if(planoTxt.equals(planoMensal)){
                
                txtResultado.setText(String.format("Você escolheu a modalidade "
                        + "%s e o %s, o valor que deverá pagar é de %.2f.\n"
                        + "Aqui vai uma tabela de preços caso queira saber sobre"
                        + " outros planos:\n\n"
                        + "Plano mensal:\t R$%.2f\n"
                        + "Plano bimestral:\t R$%.2f\n"
                        + "Plano trimestral:\t R$%.2f\n"
                        + "Plano semestral:\t R$%.2f\n"
                        + "Plano anual:\t R$%.2f\n",
                        musculacao, planoMensal, resultado, resultado, resultado2
                        ,resultado3,resultado4,resultado5));
            }
            else if(planoTxt.equals(planoBimestral)){
                
                txtResultado.setText(String.format("Você escolheu a modalidade "
                        + "%s e o %s, o valor que deverá pagar é de %.2f.\n"
                        + "Aqui vai uma tabela de preços caso queira saber sobre"
                        + " outros planos:\n\n"
                        + "Plano mensal:\t R$%.2f\n"
                        + "Plano bimestral:\t R$%.2f\n"
                        + "Plano trimestral:\t R$%.2f\n"
                        + "Plano semestral:\t R$%.2f\n"
                        + "Plano anual:\t R$%.2f\n",
                        musculacao, planoBimestral, resultado2, resultado, resultado2
                        ,resultado3,resultado4,resultado5));
                
            }
            else if(planoTxt.equals(planoTrimestral)){
                
                txtResultado.setText(String.format("Você escolheu a modalidade "
                        + "%s e o %s, o valor que deverá pagar é de %.2f.\n"
                        + "Aqui vai uma tabela de preços caso queira saber sobre"
                        + " outros planos:\n\n"
                        + "Plano mensal:\t R$%.2f\n"
                        + "Plano bimestral:\t R$%.2f\n"
                        + "Plano trimestral:\t R$%.2f\n"
                        + "Plano semestral:\t R$%.2f\n"
                        + "Plano anual:\t R$%.2f\n",
                        musculacao, planoTrimestral, resultado3, resultado, resultado2
                        ,resultado3,resultado4,resultado5));
            }
            else if(planoTxt.equals(planoSemestral)){
                
                txtResultado.setText(String.format("Você escolheu a modalidade "
                        + "%s e o %s, o valor que deverá pagar é de %.2f.\n"
                        + "Aqui vai uma tabela de preços caso queira saber sobre"
                        + " outros planos:\n\n"
                        + "Plano mensal:\t R$%.2f\n"
                        + "Plano bimestral:\t R$%.2f\n"
                        + "Plano trimestral:\t R$%.2f\n"
                        + "Plano semestral:\t R$%.2f\n"
                        + "Plano anual:\t R$%.2f\n",
                        musculacao, planoSemestral, resultado4, resultado, resultado2
                        ,resultado3,resultado4,resultado5));
            }
            else if(planoTxt.equals(planoAnual)){
                
                txtResultado.setText(String.format("Você escolheu a modalidade "
                        + "%s e o %s, o valor que deverá pagar é de %.2f.\n"
                        + "Aqui vai uma tabela de preços caso queira saber sobre"
                        + " outros planos:\n\n"
                        + "Plano mensal:\t R$%.2f\n"
                        + "Plano bimestral:\t R$%.2f\n"
                        + "Plano trimestral:\t R$%.2f\n"
                        + "Plano semestral:\t R$%.2f\n"
                        + "Plano anual:\t R$%.2f\n",
                        musculacao, planoAnual, resultado5, resultado, resultado2
                        ,resultado3,resultado4,resultado5));
            }
        }
        else if(modalidadeTxt.equals(natacao)){
            Double valorNatacao = 59.90;
            Double resultado = valorNatacao * valorMensal;
            Double resultado2 = valorNatacao * valorBimestral;
            Double resultado3 = valorNatacao * valorTrimestral;
            Double resultado4 = valorNatacao * valorSemestral;
            Double resultado5 = valorNatacao * valorAnual;
            
            if(planoTxt.equals(planoMensal)){
                
                txtResultado.setText(String.format("Você escolheu a modalidade "
                        + "%s e o %s, o valor que deverá pagar é de %.2f.\n"
                        + "Aqui vai uma tabela de preços caso queira saber sobre"
                        + " outros planos:\n\n"
                        + "Plano mensal:\t R$%.2f\n"
                        + "Plano bimestral:\t R$%.2f\n"
                        + "Plano trimestral:\t R$%.2f\n"
                        + "Plano semestral:\t R$%.2f\n"
                        + "Plano anual:\t R$%.2f\n",
                        natacao, planoMensal, resultado, resultado, resultado2
                        ,resultado3,resultado4,resultado5));
            }
            else if(planoTxt.equals(planoBimestral)){
                
                txtResultado.setText(String.format("Você escolheu a modalidade "
                        + "%s e o %s, o valor que deverá pagar é de %.2f.\n"
                        + "Aqui vai uma tabela de preços caso queira saber sobre"
                        + " outros planos:\n\n"
                        + "Plano mensal:\t R$%.2f\n"
                        + "Plano bimestral:\t R$%.2f\n"
                        + "Plano trimestral:\t R$%.2f\n"
                        + "Plano semestral:\t R$%.2f\n"
                        + "Plano anual:\t R$%.2f\n",
                        natacao, planoBimestral, resultado2, resultado, resultado2
                        ,resultado3,resultado4,resultado5));
            }
            else if(planoTxt.equals(planoTrimestral)){
                
                txtResultado.setText(String.format("Você escolheu a modalidade "
                        + "%s e o %s, o valor que deverá pagar é de %.2f.\n"
                        + "Aqui vai uma tabela de preços caso queira saber sobre"
                        + " outros planos:\n\n"
                        + "Plano mensal:\t R$%.2f\n"
                        + "Plano bimestral:\t R$%.2f\n"
                        + "Plano trimestral:\t R$%.2f\n"
                        + "Plano semestral:\t R$%.2f\n"
                        + "Plano anual:\t R$%.2f\n",
                        natacao, planoTrimestral, resultado3, resultado, resultado2
                        ,resultado3,resultado4,resultado5));
            }
            else if(planoTxt.equals(planoSemestral)){
                
                txtResultado.setText(String.format("Você escolheu a modalidade "
                        + "%s e o %s, o valor que deverá pagar é de %.2f.\n"
                        + "Aqui vai uma tabela de preços caso queira saber sobre"
                        + " outros planos:\n\n"
                        + "Plano mensal:\t R$%.2f\n"
                        + "Plano bimestral:\t R$%.2f\n"
                        + "Plano trimestral:\t R$%.2f\n"
                        + "Plano semestral:\t R$%.2f\n"
                        + "Plano anual:\t R$%.2f\n",
                        natacao, planoSemestral, resultado4, resultado, resultado2
                        ,resultado3,resultado4,resultado5));
            }
            else if(planoTxt.equals(planoAnual)){
                
                txtResultado.setText(String.format("Você escolheu a modalidade "
                        + "%s e o %s, o valor que deverá pagar é de %.2f.\n"
                        + "Aqui vai uma tabela de preços caso queira saber sobre"
                        + " outros planos:\n\n"
                        + "Plano mensal:\t R$%.2f\n"
                        + "Plano bimestral:\t R$%.2f\n"
                        + "Plano trimestral:\t R$%.2f\n"
                        + "Plano semestral:\t R$%.2f\n"
                        + "Plano anual:\t R$%.2f\n",
                        natacao, planoAnual, resultado5, resultado, resultado2
                        ,resultado3,resultado4,resultado5));
            }
        }
        else if(modalidadeTxt.equals(jiujitsu)){
            Double valorJiuJitsu = 29.90;
            Double resultado = valorJiuJitsu * valorMensal;
            Double resultado2 = valorJiuJitsu * valorBimestral;
            Double resultado3 = valorJiuJitsu * valorTrimestral;
            Double resultado4 = valorJiuJitsu * valorSemestral;
            Double resultado5 = valorJiuJitsu * valorAnual;
            
            if(planoTxt.equals(planoMensal)){
                
                txtResultado.setText(String.format("Você escolheu a modalidade "
                        + "%s e o %s, o valor que deverá pagar é de %.2f.\n"
                        + "Aqui vai uma tabela de preços caso queira saber sobre"
                        + " outros planos:\n\n"
                        + "Plano mensal:\t R$%.2f\n"
                        + "Plano bimestral:\t R$%.2f\n"
                        + "Plano trimestral:\t R$%.2f\n"
                        + "Plano semestral:\t R$%.2f\n"
                        + "Plano anual:\t R$%.2f\n",
                        jiujitsu, planoMensal, resultado, resultado, resultado2
                        ,resultado3,resultado4,resultado5));
            }
            else if(planoTxt.equals(planoBimestral)){
                
                txtResultado.setText(String.format("Você escolheu a modalidade "
                        + "%s e o %s, o valor que deverá pagar é de %.2f.\n"
                        + "Aqui vai uma tabela de preços caso queira saber sobre"
                        + " outros planos:\n\n"
                        + "Plano mensal:\t R$%.2f\n"
                        + "Plano bimestral:\t R$%.2f\n"
                        + "Plano trimestral:\t R$%.2f\n"
                        + "Plano semestral:\t R$%.2f\n"
                        + "Plano anual:\t R$%.2f\n",
                        jiujitsu, planoBimestral, resultado2, resultado, resultado2
                        ,resultado3,resultado4,resultado5));
            }
            else if(planoTxt.equals(planoTrimestral)){
                
                txtResultado.setText(String.format("Você escolheu a modalidade "
                        + "%s e o %s, o valor que deverá pagar é de %.2f.\n"
                        + "Aqui vai uma tabela de preços caso queira saber sobre"
                        + " outros planos:\n\n"
                        + "Plano mensal:\t R$%.2f\n"
                        + "Plano bimestral:\t R$%.2f\n"
                        + "Plano trimestral:\t R$%.2f\n"
                        + "Plano semestral:\t R$%.2f\n"
                        + "Plano anual:\t R$%.2f\n",
                        jiujitsu, planoTrimestral, resultado3, resultado, resultado2
                        ,resultado3,resultado4,resultado5));
            }
            else if(planoTxt.equals(planoSemestral)){
                
                txtResultado.setText(String.format("Você escolheu a modalidade "
                        + "%s e o %s, o valor que deverá pagar é de %.2f.\n"
                        + "Aqui vai uma tabela de preços caso queira saber sobre"
                        + " outros planos:\n\n"
                        + "Plano mensal:\t R$%.2f\n"
                        + "Plano bimestral:\t R$%.2f\n"
                        + "Plano trimestral:\t R$%.2f\n"
                        + "Plano semestral:\t R$%.2f\n"
                        + "Plano anual:\t R$%.2f\n",
                        jiujitsu, planoSemestral, resultado4, resultado, resultado2
                        ,resultado3,resultado4,resultado5));
            }
            else if(planoTxt.equals(planoAnual)){
                
                txtResultado.setText(String.format("Você escolheu a modalidade "
                        + "%s e o %s, o valor que deverá pagar é de %.2f.\n"
                        + "Aqui vai uma tabela de preços caso queira saber sobre"
                        + " outros planos:\n\n"
                        + "Plano mensal:\t R$%.2f\n"
                        + "Plano bimestral:\t R$%.2f\n"
                        + "Plano trimestral:\t R$%.2f\n"
                        + "Plano semestral:\t R$%.2f\n"
                        + "Plano anual:\t R$%.2f\n",
                        jiujitsu, planoAnual, resultado5, resultado, resultado2
                        ,resultado3,resultado4,resultado5));
            }
        }
        else if(modalidadeTxt.equals(muaythai)){
            Double valorMuayThai = 34.90;
            Double resultado = valorMuayThai * valorMensal;
            Double resultado2 = valorMuayThai * valorBimestral;
            Double resultado3 = valorMuayThai * valorTrimestral;
            Double resultado4 = valorMuayThai * valorSemestral;
            Double resultado5 = valorMuayThai * valorAnual;
            
            if(planoTxt.equals(planoMensal)){
                
                txtResultado.setText(String.format("Você escolheu a modalidade "
                        + "%s e o %s, o valor que deverá pagar é de %.2f.\n"
                        + "Aqui vai uma tabela de preços caso queira saber sobre"
                        + " outros planos:\n\n"
                        + "Plano mensal:\t R$%.2f\n"
                        + "Plano bimestral:\t R$%.2f\n"
                        + "Plano trimestral:\t R$%.2f\n"
                        + "Plano semestral:\t R$%.2f\n"
                        + "Plano anual:\t R$%.2f\n",
                        muaythai, planoMensal, resultado, resultado, resultado2
                        ,resultado3,resultado4,resultado5));
            }
            else if(planoTxt.equals(planoBimestral)){
                
                txtResultado.setText(String.format("Você escolheu a modalidade "
                        + "%s e o %s, o valor que deverá pagar é de %.2f.\n"
                        + "Aqui vai uma tabela de preços caso queira saber sobre"
                        + " outros planos:\n\n"
                        + "Plano mensal:\t R$%.2f\n"
                        + "Plano bimestral:\t R$%.2f\n"
                        + "Plano trimestral:\t R$%.2f\n"
                        + "Plano semestral:\t R$%.2f\n"
                        + "Plano anual:\t R$%.2f\n",
                        muaythai, planoBimestral, resultado2, resultado, resultado2
                        ,resultado3,resultado4,resultado5));
            }
            else if(planoTxt.equals(planoTrimestral)){
                
                txtResultado.setText(String.format("Você escolheu a modalidade "
                        + "%s e o %s, o valor que deverá pagar é de %.2f.\n"
                        + "Aqui vai uma tabela de preços caso queira saber sobre"
                        + " outros planos:\n\n"
                        + "Plano mensal:\t R$%.2f\n"
                        + "Plano bimestral:\t R$%.2f\n"
                        + "Plano trimestral:\t R$%.2f\n"
                        + "Plano semestral:\t R$%.2f\n"
                        + "Plano anual:\t R$%.2f\n",
                        muaythai, planoTrimestral, resultado3, resultado, resultado2
                        ,resultado3,resultado4,resultado5));
            }
            else if(planoTxt.equals(planoSemestral)){
                
                txtResultado.setText(String.format("Você escolheu a modalidade "
                        + "%s e o %s, o valor que deverá pagar é de %.2f.\n"
                        + "Aqui vai uma tabela de preços caso queira saber sobre"
                        + " outros planos:\n\n"
                        + "Plano mensal:\t R$%.2f\n"
                        + "Plano bimestral:\t R$%.2f\n"
                        + "Plano trimestral:\t R$%.2f\n"
                        + "Plano semestral:\t R$%.2f\n"
                        + "Plano anual:\t R$%.2f\n",
                        muaythai, planoSemestral, resultado4, resultado, resultado2
                        ,resultado3,resultado4,resultado5));
            }
            else if(planoTxt.equals(planoAnual)){
                
                txtResultado.setText(String.format("Você escolheu a modalidade "
                        + "%s e o %s, o valor que deverá pagar é de %.2f.\n"
                        + "Aqui vai uma tabela de preços caso queira saber sobre"
                        + " outros planos:\n\n"
                        + "Plano mensal:\t R$%.2f\n"
                        + "Plano bimestral:\t R$%.2f\n"
                        + "Plano trimestral:\t R$%.2f\n"
                        + "Plano semestral:\t R$%.2f\n"
                        + "Plano anual:\t R$%.2f\n",
                        muaythai, planoAnual, resultado5, resultado, resultado2
                        ,resultado3,resultado4,resultado5));
            }
        }
        
    }//GEN-LAST:event_CalcularActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PlanoAcademia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlanoAcademia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlanoAcademia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlanoAcademia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlanoAcademia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calcular;
    private javax.swing.JLabel Tatsumaki;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbJiuJitsu;
    private javax.swing.JLabel lbModalidade;
    private javax.swing.JLabel lbModalidades;
    private javax.swing.JLabel lbMuayThai;
    private javax.swing.JLabel lbMusculacao;
    private javax.swing.JLabel lbNatacao;
    private javax.swing.JLabel lbPlano;
    private javax.swing.JLabel lbPlanoAnual;
    private javax.swing.JLabel lbPlanoBimestral;
    private javax.swing.JLabel lbPlanoMensal;
    private javax.swing.JLabel lbPlanoSemestral;
    private javax.swing.JLabel lbPlanoTrimestral;
    private javax.swing.JLabel lbPlanos;
    private javax.swing.JTextField txtModalidade;
    private javax.swing.JTextField txtPlano;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
