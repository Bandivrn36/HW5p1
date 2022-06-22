import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {
    lateinit var wallService: WallService

    @Test
    fun getId() {
    }

    @Test
    fun addPost() {
        wallService = WallService()
        wallService.addPost(Post(1, Comments(1, true, true, true, true), 123,123, 21062022, "any text", 12, 12, false, Copyright(12, "any string", "name", "type"), Likes(3, true, true,true ), Reposts(3, true), Views(3), "Post Type", 45, true, true, true, true, true, true, Donut(false, 2, PlaceHolder("Stop"), true, "Edit"), 145))

       // assertEquals (2 , wallService.getPost(0).ownerId)
        assertNotEquals(0, wallService.getPost(0).ownerId)
    }

    @Test
    fun update() {
        wallService = WallService()
        wallService.update(Post(1, Comments(1, true, true, true, true), 123,123, 21062022, "any text", 12, 12, false, Copyright(12, "any string", "name", "type"), Likes(3, true, true,true ), Reposts(3, true), Views(3), "Post Type", 45, true, true, true, true, true, true, Donut(false, 2, PlaceHolder("Stop"), true, "Edit"), 145))


    }

    @Test
    fun getPost() {
    }
}