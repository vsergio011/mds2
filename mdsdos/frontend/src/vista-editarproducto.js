import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaEditarproducto extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%; flex-direction: row;" id="vaadinHorizontalLayout">
 <vaadin-vertical-layout theme="spacing" style="width: 40%;">
  <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 20%; padding: var(--lumo-space-l);">
   <label style="font-weight: bold; align-self: stretch; ">ID: 1234567890</label>
   <vaadin-horizontal-layout theme="spacing" style="width: 100%;">
    <label style="font-weight: bold; align-self: stretch; ">Título:</label>
    <span style="width: 70%;">Título del producto </span>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <img style="border: solid; height: 70%; width: 95%; align-self: center;">
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 60%;">
  <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 20%; padding: var(--lumo-space-l);">
   <label style="font-weight: bold; align-self: stretch; ">Descripción del producto:</label>
   <vaadin-text-area style="width: 100%; height: 100%;"></vaadin-text-area>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 90%; height: 55%; border:solid; align-self: center; padding: var(--lumo-space-m);">
   <label style="font-weight: bold; align-self: stretch;">Carácteristicas </label>
   <vaadin-text-area style="align-self: stretch; width: 100%; height: 100%;"></vaadin-text-area>
  </vaadin-vertical-layout>
  <vaadin-horizontal-layout theme="spacing" style="align-self: center; width: 90%; padding: var(--lumo-space-l); height: 25%;">
   <vaadin-vertical-layout theme="spacing" style="width: 100%;">
    <vaadin-select value="Item one" style="align-self: flex-start; width: 50%;">
     <template>
      <vaadin-list-box>
       <vaadin-item selected>
        Categorias
       </vaadin-item>
       <vaadin-item>
         Item two 
       </vaadin-item>
       <vaadin-item>
         Item three 
       </vaadin-item>
      </vaadin-list-box>
     </template>
    </vaadin-select>
    <vaadin-button style="width: 50%;">
     Cancelar
    </vaadin-button>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="width: 100%;">
    <label style="width: 50%; align-self: flex-start;">{Precio} € </label>
    <vaadin-button style="width: 50%;">
     Borrar producto
    </vaadin-button>
    <vaadin-button style="width: 50%;">
     Aceptar 
    </vaadin-button>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-editarproducto';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaEditarproducto.is, VistaEditarproducto);
