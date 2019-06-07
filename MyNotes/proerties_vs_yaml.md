## YAML
YAML is a superset of JSON, and as such is a very convenient format for specifying hierarchical configuration data.
### Loading YAML
Spring Framework provides two convenient classes that can be used to load YAML documents. The YamlPropertiesFactoryBean loads YAML as Properties and the YamlMapFactoryBean loads YAML as a Map.

#### For example, consider the following YAML document:-

    environments:
    	dev:
    		url: https://dev.example.com
    		name: Developer Setup
    	prod:
    		url: https://another.example.com
    		name: My Cool App
    
#### The preceding example would be transformed into the following properties:

    environments.dev.url=https://dev.example.com
    environments.dev.name=Developer Setup
    environments.prod.url=https://another.example.com
    environments.prod.name=My Cool App

#### YAML lists are represented as property keys with [index] dereferencers. For example, consider the following YAML:

    my:
    servers:
    	- dev.example.com
    	- another.example.com
#### The preceding example would be transformed into these properties:

    my.servers[0]=dev.example.com
    my.servers[1]=another.example.com

## Limitations of YAML
YAML files cannot be loaded by using the @PropertySource annotation. So, in the case that you need to load values that way, you need to use a properties file.
