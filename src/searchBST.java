import org.w3c.dom.Node;

public class searchBST{


    class node {
        int val;
        node right;
        node left;
        node(int val) {
            this.val = val;
        }
    }


              public  int search(node root, int val){
          int result= -1;
        if(root==null){
              return -1;
                }

        while (root!=null){
            if(root.val==val){
                 result= root.val;
            }
            
        }
        return result;
       }

}


