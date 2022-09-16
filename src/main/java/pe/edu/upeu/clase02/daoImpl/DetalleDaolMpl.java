package pe.edu.upeu.clase02.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import pe.edu.upeu.clase02.dao.Todo;
import pe.edu.upeu.clase02.entity.Detalle;

@Component
public class DetalleDaolMpl implements Todo<Detalle> {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Detalle t) {
		// TODO Auto-generated method stub
		String SQL = "INSERT INTO delalle (idventa, idproducto, precio, cantidad) VALUES (?,?,?,?)";
		return jdbcTemplate.update(SQL, t.getIdventa(), t.getIdproducto(),t.getPrecio(), t.getCantidad());
	}

	@Override
	public int update(Detalle t) {
		// TODO Auto-generated method stub
		String SQL = "UPDATE detalle SET cantidad = ? WHERE (iddetalle = ?)";
		return jdbcTemplate.update(SQL, t.getCantidad(), t.getIddetalle());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL="DELETE FROM  WHERE iddetalle = ?";
		return jdbcTemplate.update(SQL, id);
	}

	@Override
	public Detalle read(int id) {
		// TODO Auto-generated method stub
		try {
			Detalle det = jdbcTemplate.queryForObject("SELECT * FROM detalle WHERE iddetalle=?",
					BeanPropertyRowMapper.newInstance(Detalle.class), id);
			return det;
		} catch (IncorrectResultSizeDataAccessException e) {
			return null;
		}
	}

	@Override
	public List<Detalle> readAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("SELECT * FROM detalle", BeanPropertyRowMapper.newInstance(Detalle.class));
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		String SQL = "select v.idventa, v.fecha, p.idproducto, p.nombre, d.precio, d.cantidad from detalle as d inner join venta as v on d.idventa= v.idventa inner join producto as p on d.idproducto= p.idproducto";
		return jdbcTemplate.queryForList(SQL);
	}
}
