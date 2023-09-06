# Simple Java backend
## start 
to start the project run 
```
src/main/java/dev.alexitbali.movies/MoviesApplication
```
## endpoints

### get all movies
**get** method without any queries
```
localhost:8080/api/v1/movies
```
### get movie by ID
**get** method with movie ID from db
```
localhost:8080/api/v1/movies/{ID}
```
### get movie by ImdbID
**get** method with imdb id 
```
localhost:8080/api/v1/movies/imdb/{imdbId}
```
### post a review for a movie with imdbId
**post** method with imdb id and "reviewBody" key in request body
```
localhost:8080/api/v1/movies/imdb/{imdbId}
```