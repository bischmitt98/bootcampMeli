/* Faça as seguintes consultas ao banco de dados movies_db.sql trabalhado na primeira
aula.*/

-- 1. Mostrar o título e o nome do gênero de todas as séries.
SELECT series.title, genres.name FROM series
INNER JOIN genres
ON series.genre_id = genres.id;

-- 2. Mostrar o título dos episódios, o nome e sobrenome dos atores que trabalham em cada um deles.
SELECT episodes.title, actors.first_name, actors.last_name
FROM episodes INNER JOIN actor_episode
ON episodes.id = actor_episode.episode_id
INNER JOIN actors
ON actors.id = actor_episode.actor_id;

-- 3. Mostrar o título de todas as séries e o número total de temporadas que cada uma delas possui.
SELECT series.title, COUNT(seasons.serie_id)
FROM series INNER JOIN seasons
ON series.id = seasons.serie_id
GROUP BY series.title;

-- 4. Mostrar o nome de todos os gêneros e o número total de filmes de cada um, desde que seja maior 
-- ou igual a 3.
SELECT genres.name, COUNT(movies.genre_id) as movies
FROM genres INNER JOIN movies
ON genres.id = movies.genre_id
GROUP BY genres.name
HAVING movies >= 3;

-- 5. Mostrar apenas o nome e sobrenome dos atores que atuam em todos os filmes de
-- Harry Potter e que estes não se repitam.
SELECT DISTINCT(concat(actors.first_name, ' ', actors.last_name)) as actors
FROM actors INNER JOIN actor_movie
ON actors.id = actor_movie.actor_id
INNER JOIN movies ON movies.id = actor_movie.movie_id
WHERE movies.title LIKE '%Harry Potter%';