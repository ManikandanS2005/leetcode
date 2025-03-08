WITH UserRatings AS (
    SELECT u.name, COUNT(mr.rating) AS rating_count
    FROM Users u
    LEFT JOIN MovieRating mr ON u.user_id = mr.user_id
    GROUP BY u.name
    ORDER BY rating_count DESC, u.name ASC
    LIMIT 1
),
MovieRatings AS (
    SELECT m.title, AVG(mr.rating) AS avg_rating
    FROM Movies m
    LEFT JOIN MovieRating mr ON m.movie_id = mr.movie_id
    WHERE mr.created_at LIKE '2020-02-%'
    GROUP BY m.title
    ORDER BY avg_rating DESC, m.title ASC
    LIMIT 1
)
SELECT name AS results FROM UserRatings
UNION ALL
SELECT title FROM MovieRatings;
