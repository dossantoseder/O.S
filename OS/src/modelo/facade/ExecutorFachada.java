package modelo.facade;

import java.util.List;

import modelo.*;
import modelo.persiste.*;

public class ExecutorFachada {
	Executor executor;
	ExecutorDAO executorDAO = new ExecutorDAO();
	List<Executor> executores;

	public List<Executor> getListarExecutor() {

		executores = executorDAO.getListarExecutor();

		return executores;

	}

	public Executor getExecutor(int idExecutor) {

		executor = executorDAO.getExecutor(idExecutor);

		return executor;
	}
}
