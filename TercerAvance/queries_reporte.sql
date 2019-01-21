use POLIVENTAS;

select p.id_articulo, a.nombre, sum(p.cantidad) as CantidadVendida
from Pedidos p inner join Articulos a
ON p.id_articulo = a.id
where p.estado = 'E' and p.fecha between '2018-11-01' and '2019-01-31'
Group by p.id_articulo, a.nombre
limit 10;






