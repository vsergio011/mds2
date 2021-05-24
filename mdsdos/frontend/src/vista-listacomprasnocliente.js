import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';

class VistaListacomprasnocliente extends PolymerElement {

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
 <vaadin-vertical-layout theme="spacing" style="width: 100%; padding: var(--lumo-space-xl);">
  <label>Seleccionar compras:</label>
  <vaadin-vertical-layout theme="spacing">
   <vaadin-button>
     Alta categoria 
   </vaadin-button>
   <vaadin-button>
     Alta producto 
   </vaadin-button>
   <vaadin-button>
     Modificar empleados 
   </vaadin-button>
   <vaadin-button>
     Mensajes 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing">
   <vaadin-button>
     Nuevo 
   </vaadin-button>
   <vaadin-button>
     Enviado 
   </vaadin-button>
   <vaadin-button>
     Recibido 
   </vaadin-button>
   <vaadin-button>
     Fecha 
   </vaadin-button>
  </vaadin-vertical-layout>
  <img src="https://img.alicdn.com/tps/TB1mYC8KVXXXXaHXXXXXXXXXXXX-566-678.png" style="width: 40%;">
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; padding: var(--lumo-space-xl);">
  <vaadin-text-field placeholder="Buscar pedido" style="width: 100%;">
   <iron-icon icon="lumo:search" slot="prefix"></iron-icon>
  </vaadin-text-field>
  <vaadin-list-box style="width: 100%;">
   <vaadin-item>
     Item one 
   </vaadin-item>
   <vaadin-item>
     Item two 
   </vaadin-item>
   <vaadin-item>
     Item three 
   </vaadin-item>
  </vaadin-list-box>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-listacomprasnocliente';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaListacomprasnocliente.is, VistaListacomprasnocliente);
