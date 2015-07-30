package com.fabweblist21.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fabweblist21.persistencia.entidade.Aluno;
import com.fabweblist21.persistencia.jdbc.AlunoDAO;


@WebServlet("/alunocontroller.do")
public class AlunoController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	AlunoDAO dao =  new AlunoDAO();
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String acao = req.getParameter("acao");
		String aluno = req.getParameter("aluno");
		String nota = req.getParameter("nota");
			
		if (acao.equalsIgnoreCase("cad")){
			
			Aluno alunocad = new Aluno();
				alunocad.setNome(aluno);
				alunocad.setNota(Double.parseDouble(nota));
		
				dao.cadastrarAluno(alunocad);
				resp.getWriter().print("Cadastrado com Sucesso");
				
		}else if(acao.equalsIgnoreCase("form")){
			
			Aluno alunos = new Aluno();
			alunos.setId(0);
			alunos.setNome("");
			alunos.setNota(0);
			
			req.setAttribute("alunos", alunos);
			req.getRequestDispatcher("/WEB-INF/aluno.jsp").forward(req, resp);
			
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String acao = req.getParameter("acao");
		String aluno = req.getParameter("aluno");
		String nota = req.getParameter("nota");
	
		
		
		Aluno alunocad = new Aluno();
		AlunoDAO dao =  new AlunoDAO();
		
				alunocad.setNome(aluno);
				alunocad.setNota(Double.parseDouble(nota));
		
				dao.cadastrarAluno(alunocad);
				
				//req.getRequestDispatcher("WEB-INF/aluno.jsp").forward(req, resp);
				
				resp.getWriter().print("Cadastrado com Sucesso");
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}
	
}
