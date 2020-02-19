import os
import sys


def run():
    main_dir = sys.argv[1]
    directory_name = sys.argv[2]
    link = sys.argv[3]
    update_global_readme(link)
    create_directory_with_readme_file(main_dir, directory_name, link)


def create_directory_with_readme_file(main_dir, directory_name, link):
    os.chdir(main_dir)
    os.mkdir(directory_name)
    os.chdir(directory_name)
    readme_file = open("README.md", "w+")
    readme_file.write("## Solution for problem:\r\n")
    readme_file.write(link)
    readme_file.close()


def update_global_readme(link):
    readme_file = open("README.md", "a")
    readme_file.write("1. " + link + "\r\n")
    readme_file.close()

if __name__ == "__main__":
    run()
