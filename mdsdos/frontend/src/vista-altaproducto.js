import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-combo-box/src/vaadin-combo-box.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaAltaproducto extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;">
 <vaadin-vertical-layout theme="spacing" style="width: 80%;">
  <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
   <vaadin-vertical-layout theme="spacing" style="width: 100%; flex-grow: 0; flex-shrink: 0; padding: var(--lumo-space-l);">
    <label style="font-weight: bold; align-self: stretch; " id="titleLbl">Alta producto</label>
    <vaadin-horizontal-layout theme="spacing">
     <label>Título </label>
     <input type="text" id="inputTitulo">
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-horizontal-layout style="flex-shrink: 0; width: 50%; align-self: flex-start;">
    <vaadin-vertical-layout id="vlImages"></vaadin-vertical-layout>
    <img style=" align-self: center; width: 70%;" id="img" img="https://www.ikea.com/mx/es/images/products/urskog-cojin-leon-gris__0552849_pe659099_s5.jpg?f=xs" src="https://www.ikea.com/mx/es/images/products/urskog-cojin-leon-gris__0552849_pe659099_s5.jpg?f=xs">
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: space-around;">
    <vaadin-button id="deleteImgBtn">
      Borrar imagen 
    </vaadin-button>
    <vaadin-button id="modificarImgBtn">
      Cambiar imagen 
    </vaadin-button>
    <vaadin-button id="addImgBtn">
      Agregar Imagen 
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="align-self: center;" id="horizontalLYUpImg"></vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; flex-grow: 0; flex-shrink: 1;background-color:#f5f5f5">
  <vaadin-vertical-layout theme="spacing" style="width: 90%; padding: var(--lumo-space-l); flex-shrink: 0; height: 15%; align-self: center;">
   <label style="font-weight: bold; align-self: stretch;">Descripción del producto</label>
   <vaadin-text-area placeholder="Add detailed explanation" style="width: 80%;" id="descripcionInput"></vaadin-text-area>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 90%; height: 55%;  align-self: center; padding: var(--lumo-space-m);">
   <label style="font-weight: bold; align-self: stretch;" id="label">Caracteristicas</label>
   <vaadin-text-area style="align-self: stretch; width: 100%; height: 100%;    background-color: hsl(0deg 0% 86% / 40%);" id="vaadinTextArea"></vaadin-text-area>
  </vaadin-vertical-layout>
  <vaadin-horizontal-layout theme="spacing" style="align-self: center; width: 90%; padding: var(--lumo-space-l);background-color:#b0c4de;border-radius: 20px 20px 20px 20px;">
   <vaadin-vertical-layout theme="spacing" style="width: 100%;">
    <vaadin-combo-box id="productoCategorias" allow-custom-value></vaadin-combo-box>
    <vaadin-button id="cancelBtn">
      Cancelar 
    </vaadin-button>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="width: 100%;">
    <vaadin-text-field value="precio" id="productoPrecio" has-value>
     <div slot="prefix">
       $ 
     </div>
     <label>Label</label>
    </vaadin-text-field>
    <vaadin-button style="width: 50%;" id="addBtn">
      Añadir 
    </vaadin-button>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-altaproducto';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaAltaproducto.is, VistaAltaproducto);