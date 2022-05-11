# bookstore-absa
bookstore api
Hi to those reading this I have managed to add this spring boot project into this Repo 
while also adding some Github workflow operations CI/CD to the process, along with TerraForm for
a job which is envoqued on a github "push event", the one part that sucks is when it keeps failing i get
a email but when it works there is no notification just green means good and red means bad.

Inside the Terraform are some configurations, as which have associations with AWS configurations 
starting off with the for aws ami ( amazon machine image) and other search options for datasource 
we want to add to our image and what the image should be running as in this case its Ubuntu.

I have terraform running locally as well hence the file 'bookstoreabsa.tf' I also connected to the amazon ubuntu box
locally and checked that a jar was created in the follow path: 
first enter 
sudo ssh -i "bookstorekey.pem" ubuntu@ec2-34-204-17-161.compute-1.amazonaws.com

to retrive access credentials which are ${{ secrets.AWS_KEY_ID }} and ${{ secrets.AWS_ACCESS_KEY }}
on this repository for security reasons I used them as repository enviornment variables

then you enter the box inside your local as does terraform using the credentials
leading to the path "/home/ubuntu/actions-runner/_work/bookstore-absa/bookstore-absa/target"

this is where you will find your executable jar inside the EC2 container
because EC2 doesnt provision for public IP's, If I have more time I would add a VPC and access one of the Route internet gateways.


 
