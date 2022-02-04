use sqltrainee22;
select * from categories;
select categories.name, COALESCE(sum(products.amount), 0) as sum from products RIGHT JOIN 
categories ON categories.id = products.id_categories GROUP BY categories.name  ORDER BY sum(products.amount); 
