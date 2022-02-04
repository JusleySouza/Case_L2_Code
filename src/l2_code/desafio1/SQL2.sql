use sqltrainee22;
select * from categories;
select products.id_categories, categories.name as categories, orders_products.units_sold as sum from categories INNER JOIN 
(products INNER JOIN orders_products  ON products.id = orders_products.product_id)  ON categories.id = products.id_categories  
 ORDER BY orders_products.units_sold DESC limit 4 ; 