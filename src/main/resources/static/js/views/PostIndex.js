export default function PostIndex(props) {
    return `
        <header>
            <h1>Posts Page</h1>
        </header>
        <main>
        <form>
        <div class ="forms-group">
        <label for="postid">post id</label>
        <input type="text" class="formcontrol" id="postid" placeholder="id">
</div>

        <div class ="forms-group">
        <label for="post-title">title</label>
        <input type="text" class="formcontrol" id="post-title" placeholder="enter title">
</div>

        <div class ="forms-group">
        <label for="post-content">content</label>
        <input type="text" class="formcontrol" id="post-content" placeholder="enter content" rows="3"></textarea>
        
</div>
<button type="submit" class="btn btn-primary" id="submit">Submit</button>
</form>
   
            <div>
                ${props.posts.map(post => `<h3>${post.title}</h3>`).join('')}   
            </div>
        </main>
    `;
}


export function postEvents(){

}

function createPostEvent(){
    $("#Submit").click(function (){
        let post = {
            title: $("post-title").val(),
            content: $("post-content").val()
        }

        let request = {
            method: 'POST',
            headers: {'Content-Type': 'application/json'},
            body: JSON.stringify(post)

        }
        fetch("http://localhost:8080/api/posts", request).then(createView("/posts"));
    })
}