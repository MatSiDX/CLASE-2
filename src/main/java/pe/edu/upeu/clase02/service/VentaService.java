package pe.edu.upeu.clase02.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.clase02.dao.Todo;
import pe.edu.upeu.clase02.daoImpl.VentaDaolMpl;
import pe.edu.upeu.clase02.entity.Venta;

@Service
public class VentaService implements Todo<Venta> {

	@Autowired
	private VentaDaolMpl daolMpl;

	@Override
	public int create(Venta t) {
		// TODO Auto-generated method stub
		return daolMpl.create(t);
	}

	@Override
	public int update(Venta t) {
		// TODO Auto-generated method stub
		return daolMpl.update(t);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return daolMpl.delete(id);
	}

	@Override
	public Venta read(int id) {
		// TODO Auto-generated method stub
		return daolMpl.read(id);
	}

	@Override
	public List<Venta> readAll() {
		// TODO Auto-generated method stub
		return daolMpl.readAll();
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return daolMpl.readAll2();
	}

}
