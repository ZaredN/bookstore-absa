terraform {
  required_providers {
    aws = {
      source  = "hashicorp/aws"
      version = "4.13.0"
    }
  }
}

provider "aws" {
  # Configuration options


  region = "us-east-2"
}

data "aws_ami" "app" {

  most_recent = true

  filter {
    name = "name"

    values = ["ubuntu/images/hvm-ssd/ubuntu-focal-20.04-amd64-server-*"]
  }

  filter {
    name = "virtualization-type"

    values = ["hvm"]
  }

  filter {
    name   = "architecture"
    values = ["x86_64"]
  }


  owners = ["099720109477"] #canonical official /self ubuntu images
}

resource "aws_instance" "bookstore_web" {
  ami = data.aws_ami.app.id

  instance_type = "t3.small"

  root_block_device {
    volume_size = 8 #GB minimum for EC2
  }
}
